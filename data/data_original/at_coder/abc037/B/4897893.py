I=lambda:map(int,input().split());n,q=I();a=[0]*n;exec('l,r,t=I();a[l-1:r]=[t]*(r-l+1);'*q);print(*a,sep='\n')