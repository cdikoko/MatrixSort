package runner;

import java.util.ArrayList;

public class MergeSort{
	

	public MergeSort(ArrayList<Integer> inputArray){
		inputArray = MatrixSort.matrix;
	}
	
	public ArrayList<Integer> getSortedArray(){
		return MatrixSort.matrix;
	}
	
	public void sortGivenArray(){
		divide(0, MatrixSort.matrix.size()-1);
		
	}

	private void divide(int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		if(startIndex < endIndex && (endIndex-startIndex)>=1){
			int mid = (endIndex + startIndex)/2;
			divide(startIndex, mid);
			divide(mid+1, endIndex);
			
			merger(startIndex, mid, endIndex);
		}
	}

	private void merger(int startIndex, int mid, int endIndex) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();
		
		int leftIndex = startIndex;
		int rightIndex = mid;
		
		
		while(leftIndex <= mid && rightIndex <= endIndex){
			if(MatrixSort.matrix.get(leftIndex)<= MatrixSort.matrix.get(rightIndex)){
				mergedSortedArray.add(MatrixSort.matrix.get(leftIndex));
				leftIndex++;
			}else{
				mergedSortedArray.add(MatrixSort.matrix.get(rightIndex));
				rightIndex++;
			}
		}
		
		while(leftIndex<= mid){
			mergedSortedArray.add(MatrixSort.matrix.get(leftIndex));
			leftIndex++;
		}
		
		while(rightIndex<= endIndex){
			mergedSortedArray.add(MatrixSort.matrix.get(rightIndex));
			rightIndex++;
		}
		
		
		int i = 0;
		int j = startIndex;
		
		while(i<mergedSortedArray.size()){
			MatrixSort.matrix.set(j, mergedSortedArray.get(i++));
			j++;
		}
		
		
	}

}
