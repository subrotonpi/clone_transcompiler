def import sys , stdin , stdout , stderr , line
from os import stdin , stdout , stderr , line
n = None
nums = [ ]
try :
    with stdin.open ( 'r' ) as f :
        n = int ( line.rstrip ( ) )
        nums = [ int ( i ) for i in f.readlines ( ) ]
except ValueError :
    sys.stderr.write ( 'Please provide a list of integers to process.\n' )
    sys.exit ( 1 )
b = False
idx = 0
sum = 0
for i in range ( 0 , len ( nums ) - 1 ) :
    sum += 1
    if nums [ idx ] == 2 :
        b = True
        break
    else :
        idx = nums [ idx ] - 1
sys.stdout.write ( sum if b is True else - 1 )
