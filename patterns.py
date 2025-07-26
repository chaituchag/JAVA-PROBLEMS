n=5
# for i in range (n):
#     for j in range((n-i)):
#         print(end=" ")
#     for k in range(i):
#         print("*",end=" ")

# for i in range(n-1):
#     for k in range(i,n-1):
#         print(" ",end=" ")
#     for j in range (i+1):
#         print("*",end=" ")
#     for k in range(i):
#         print("*",end=" ")
#     print(end='\n')
# for i in range(n):
#     for k in range(i):
#         print(" ",end=" ")
#     for j in range (i,n-1):
#         print("*",end=" ")
#     for k in range(i,n):
#         print("*",end=" ")
#     print(end='\n')


def clas(n):
    n=int (input("enter"))
    if (n==1 or n==0):
        return 1
    else:
        return n*clas((n-1))
clas(n)
