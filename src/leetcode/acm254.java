package leetcode;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月27日 20:23
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 27 20:23
 *@description
 */
public class acm254 {

    /*
    *
    * #include<cstdio>
#include<vector>
#include<algorithm>
using namespace std;
const int maxn=100100,INF=0x7fffffff;
int n,m,s,e,ans,a[maxn],b[maxn],f[maxn];
vector<int> p[maxn];
int main()
{
#ifndef ONLINE_JUDGE
	freopen("cf.in","r",stdin);
	freopen("cf.out","w",stdout);
#endif
	scanf("%d%d%d%d",&n,&m,&s,&e);
	for(int i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(int i=0;i<m;i++)
		scanf("%d",&b[i]),p[b[i]].push_back(i);
	for(int i=0;i<maxn;i++)
		f[i]=s,p[i].push_back(INF);
	f[0]=-1;
	for(int i=0;i<n;i++)
		for(int j=s/e;j;j--){
			f[j]=min(f[j],*upper_bound(p[a[i]].begin(),p[a[i]].end(),f[j-1]));
			if(f[j]+i+2+j*e<=s)ans=max(ans,j);
		}
	printf("%d\n",ans);
	return 0;
}
    *
    *
    * */

}
