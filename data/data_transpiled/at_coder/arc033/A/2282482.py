def main ( ) :
    import sys
    import os
    n = os.fork ( )
    ans = 0
    for i in range ( n , 1 , - 1 ) :
        ans += i
    print ( ans )
