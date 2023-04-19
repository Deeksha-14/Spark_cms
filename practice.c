#include <stdio.h>

int main()
{
int i,j,col,row;
int a[10][10];
printf("enter column: ");
scanf("%d",&col);

printf("enter rows: ");
scanf("%d",&row);

for(i=0;i<col;i++)
{
    for(j=0;j<row;j++)
    {
       scanf("%d",&a[i][j]);
    }
}

for(i=0;i<col;i++)
{
    for(j=0;j<row;j++)
    {
        //lower triangular
        if(j>i)
        {printf("array= %d",a[i][j]);}
    }
}

for(i=0;i<col;i++)
{
    for(j=0;j<row;j++)
    {
        //upper triangular
        if(j<i)
        {printf("array= %d",a[i][j]);}
    }
}
return 0;
}