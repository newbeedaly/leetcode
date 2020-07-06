package cn.newbeedaly.springbootdemo.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: two sum
 * @Author: liqk
 * @Date: 2020/7/6
 **/
public class problems1 {

  /**
   Given an array of integers, return indices of the two numbers such that they add up to a specific target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   Example:

   Given nums = [2, 7, 11, 15], target = 9,

   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
  **/

  private static int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
      if(map.get(target-nums[i]) != null){
        return new int[] {map.get(target-nums[i]), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }

  public static void main(String[] args) {

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = twoSum(nums, target);

    System.out.println(JSON.toJSONString(result));

  }

}
