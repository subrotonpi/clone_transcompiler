def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.__next__ ( )
        i = 1
        a = s
        nums = set ( [ a ] )
        while True :
            i += 1
            if a % 2 == 0 :
                a /= 2
            else :
                a = 3 * a + 1
            if a in nums :
                print ( i )
                return
            nums.add ( a )
