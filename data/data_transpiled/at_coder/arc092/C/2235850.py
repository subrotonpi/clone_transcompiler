def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        a = [ ]
        odd = 0
        even = 0
        max = sys.maxint
        mp = - 1
        for i in range ( 1 , N + 1 ) :
            temp = sc.read ( )
            if temp > max :
                max = temp
                mp = i
            if temp > 0 :
                a.append ( True )
                if i % 2 == 1 :
                    odd += temp
                else :
                    even += temp
        if odd == 0 and even == 0 :
            print ( max )
            print ( N - 1 )
            for i in range ( N , mp - 1 , - 1 ) :
                print ( i )
            for i in range ( 1 , mp ) :
                print ( 1 )
            return
        print ( max ( odd , even ) )
        offset = 1 if odd > even else 0
        p = N
        al = [ ]
        while not a [ p ] or ( p + offset ) % 2 :
            al.append ( p )
            p -= 1
        left = 0
        while not a [ left ] or ( left + offset ) % 2 :
            left += 1
        for i in range ( p - 2 , left , - 2 ) :
            if a [ i ] :
                al.append ( i + 1 )
            else :
                al.append ( i )
        for i in range ( 1 , left ) :
            al.append ( 1 )
        print ( len ( al ) )
        for i in al :
            print ( i )
        return
return Main
