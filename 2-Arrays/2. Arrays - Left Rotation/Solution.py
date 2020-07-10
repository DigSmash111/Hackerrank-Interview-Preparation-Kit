def rotLeft(a, d):
  arr2=[]
  for i in range(len(a)):
    k = len(a)-d
    arr2.append(a[i-k])
  return arr2

n = int(input())
d = int(input())
a = []
for i in range(n):
  a.append(int(input()))

result = rotLeft(a, d)
print(result)
