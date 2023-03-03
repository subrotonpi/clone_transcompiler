def import solve
import sys
solve ( )
def solve ( ) :
    with open ( 'test.txt' , 'r' ) as f :
        x = f.read ( )
    count = 1
    sum = 0
    while 1 :
        sum += count
        if sum >= x :
            break
        count += 1
    print ( count )
