class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int freq1[]=new int[1001];
        int freq2[]=new int[1001];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            freq1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            freq2[nums2[i]]++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]>0 && freq2[i]>0){
                list.add(i);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}