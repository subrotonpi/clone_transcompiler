def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        a = [ sc.read ( ) for i in range ( n ) ]
        ans = syakutori ( a , n )
        print ( ans )
    def syakutori ( a , n ) :
        right = 1
        res = 0
        ans = 0
        for left in range ( n ) :
            while right < n and ( left >= right or a [ right - 1 ] < a [ right ] ) :
                right += 1
            ans += max ( 0 , right - left )
            if left >= right :
                right += 1
        return ans
