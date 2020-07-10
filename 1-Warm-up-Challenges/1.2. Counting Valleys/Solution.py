def countingValleys(s):
  steps = list(s)

  altitude, valley_count=0, 0

  for i in steps:
    if i=='U':
      altitude+=1
      if altitude==0:
        valley_count+=1
    elif i=='D':
      altitude-=1
      
  return valley_count 

n=int(input())
s=[]
for i in range(n):
  s.append(input())
result = countingValleys(s)
print(result)
