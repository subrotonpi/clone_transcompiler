def import _syakutori
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        n = sc.read ( )
        a = [ sc.read ( ) for i in range ( n ) ]
        s = set ( )
        ans = _syakutori ( a , n , s )
        print ( ans )
    def syakutori ( a , n , s ) :
        right = 0
        res = 0
        sum = 0
        for left in range ( n ) :
            while right < n and a [ right ] not in s :
                s.add ( a [ right ] )
                right += 1
            res = max ( res , right - left )
            if left >= right :
                right += 1
                continue
            s.discard ( a [ left ] )
        return res
