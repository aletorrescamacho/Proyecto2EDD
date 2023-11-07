/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Rebeca
 */
import java.util.Arrays;


public class MinHeap {
	
	protected int[] heapArray; // array storing heap elements
	protected int capacity;    // maximum heap size
	protected int heapSize;    // current heap size
	
	public MinHeap(int capacity) { // constructor
		this.heapSize = 0; 
		this.capacity = capacity; 
		this.heapArray = new int[capacity];
	}
	
	
	protected static int getParentIdx(int idx) {
		return (idx-1)/2;
	}
	
	protected static int getLeftIdx(int idx) {
		return idx*2 + 1;
	}
	
	protected static int getRightIdx(int idx) {
		return idx*2 + 2;
	}
	
	protected void swap(int[] a, int p1, int p2) {
		if (p1<0 || p1>a.length-1 || p2<0 || p2>a.length-1) return;
		int temp = a[p1];
		a[p1] = a[p2];
		a[p2] = temp;
	}
	
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(this.heapArray, 0, this.heapSize));
	}
        
	/**
	 * Insert a new element into the heap
	 * --> append to the end as a leaf and repair the heap by "percolation up" if needed
	 */
	public void insert(int e) {
		if (this.heapSize == this.capacity) {
			System.out.println("\nHeap capacity reached! No more elements allowed.\n");
			return;
		}
		heapArray[heapSize] = e;
                                            heapSize = heapSize + 1;
		int curPos = heapSize - 1; 
		int parPos = getParentIdx(curPos);
		while (heapArray[parPos] > heapArray[curPos] && curPos > 0) {
			swap(heapArray, curPos, parPos);
			curPos = parPos;
			parPos = getParentIdx(curPos);
		}
	}
	
	/**
	 * Get minimum element
	 */
	public int getMin() {
		return this.heapArray[0];
	}
	
	/**
	 * Extract minimum element
	 * --> return the min element and remove it from the heap
	 */
	public int extractMin() {
		int min = getMin();
		swap(this.heapArray, 0, heapSize-1);
		this.heapSize--; 
		if (0 < this.heapSize) minHeapify(0);
		return min;
	}
	
	/**
	 * Delete an element stored at given index
	 */
	public void delete(int idx) {
		if (idx >= this.heapSize) {
			System.out.println("\nNo element found or index out of heap capacity!\n");
			return;
		}
		swap(this.heapArray, idx, heapSize-1);
		this.heapSize--;
		if (idx < this.heapSize) minHeapify(idx);
	}
	
	/**
	 * Print out a min heap in "heap" (complete tree) format
	 */
	public void treePrint() {
		int levelSize = 1, cover = 0, level = 1;
		int remain = this.heapSize;
		while (remain > 0) {
			System.out.print("Level " + (level++) + ": "); 
			int i = cover;
			cover += Math.min(levelSize, remain);
			for (; i<cover; i++) System.out.print(this.heapArray[i] + " ");
			System.out.println();
			remain -= levelSize; 
			levelSize <<= 1;
		}
	}
	
	/* Heapify procedure can be applied to a node only if its child nodes have been heapified. */
	/* Hence orverall heapification on an array needs to be performed in bottom up manner. */
	/**
	 * Repair a heap with root at given index (assuming all sub-trees have been heapified)
	 */
	public void minHeapify(int idx) {
		if (idx >= this.heapSize) {
			System.out.println("\nNo element found or index out of heap capacity!\n");
			return;
		}
		int curPos = idx;
		int leftPos = getLeftIdx(curPos), rightPos = getRightIdx(curPos);
		while (true) {
			if (leftPos < heapSize && heapArray[curPos] > heapArray[leftPos] && (rightPos >= heapSize || heapArray[rightPos] >= heapArray[leftPos])) {
				swap(this.heapArray, curPos, leftPos);
				curPos = leftPos;
			} else if (rightPos < heapSize && heapArray[curPos] > heapArray[rightPos] && heapArray[leftPos] > heapArray[rightPos]) {
				swap(this.heapArray, curPos, rightPos);
				curPos = rightPos;
			} else break;
			leftPos = getLeftIdx(curPos);
			rightPos = getRightIdx(curPos);
		}
	}
	
	/**
	 * Check if a given integer array is completely heapified. 
	 */
	public static boolean isMinHeap(int[] a) {
		for (int i=getParentIdx(a.length-1); i>=0; i--) { // start checking from last parent node
			int l = getLeftIdx(i), r = getRightIdx(i);
			if (l < a.length && a[l] < a[i]) return false;
			if (r < a.length && a[r] < a[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
                                            MinHeap heap = new MinHeap(10); 
		System.out.println("Welcome to the rabbit hole of min heaps!\n");
		System.out.println("[O(logN)] Inserting new elements...");
                                            heap.insert(4);
		heap.insert(5);
		heap.insert(2);
		heap.insert(8);
		heap.insert(3);
		heap.insert(7);
		heap.insert(6);
		
		/**
		 * After above insertion, the min heap should look like
		 * 
		 *           2
		 *         /   \
		 *        3     4
		 *       / \   / \
		 *      8   5 7   6 
		 */
		heap.treePrint();
		System.out.println("Printing Min Heap as array: " + heap.toString());
		System.out.println("[O(1)] Get min: " + heap.getMin());
		System.out.println("[O(logN)] Extract min: " + heap.extractMin());
		System.out.println("Printing Min Heap as array: " + heap.toString());
		System.out.println("[O(logN)] Extract min: " + heap.extractMin());
		System.out.println("Printing Min Heap as array: " + heap.toString());
		System.out.println("[O(logN)] Inserting new elements...");
		heap.insert(9);
		heap.insert(1);
		heap.insert(11);
		heap.insert(15);
		heap.insert(10);
		System.out.println("Printing Min Heap as array: " + heap.toString());
		int idx = 4;
		System.out.println("[O(logN)] Delete element at index " + idx + "...");
		heap.delete(idx);
		System.out.println("Printing Min Heap as array: " + heap.toString());
		idx = 1;
		System.out.println("[O(logN)] Delete element at index " + idx + "...");
		heap.delete(idx);
		System.out.println("Printing Min Heap as array: " + heap.toString());
		
		System.out.println("[O(N)Initializing from a given array ...");
		int[] init = {2, 7, 1, 9, 3, 2, 6, 8, 4, 0, 3, 5}; 
		try {
			
			System.out.println("Initial array: " + Arrays.toString(init));
			System.out.println("Is min heap? " + MinHeap.isMinHeap(init));
			System.out.println("Initialized min heap in array format: " + heap.toString());
			System.out.println("Is min heap? " + MinHeap.isMinHeap(Arrays.copyOfRange(heap.heapArray, 0, heap.heapSize)));
			heap.treePrint();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nAll rabbits gone.");
	}
                            
	}

