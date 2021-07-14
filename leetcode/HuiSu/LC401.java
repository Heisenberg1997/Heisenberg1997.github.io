package HuiSu;
import java.util.*;

/**
 * num 表示可以亮灯个数
 * h代表当前为几点
 * m代表当前为几分
 * idx表示 亮灯的下标
 */
class LC401 {

    public List<String> readBinaryWatch(int num) {
        List<String> ans=new ArrayList<>();
        int[] a=new int[]{1,2,4,8,1,2,4,8,16,32};
        dfs(ans,a,num,0,0,0);
        return ans;
    }
    public void dfs(List<String> ans,int[] a,int cnt,int h,int m,int idx){
        if(cnt==0)ans.add(h+":"+(m>9?m:"0"+m));
        for(int i=idx;i<10&&cnt>0;i++){
            if(i<4&&h+a[i]<12)dfs(ans,a,cnt-1,h+a[i],m,i+1);
            if(i>=4&&m+a[i]<60)dfs(ans,a,cnt-1,h,m+a[i],i+1);
        }
    }
}