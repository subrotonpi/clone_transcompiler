def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 10
            self.DEBUG = False
        def __call__ ( self , * args ) :
            sc = sys.stdin
            left = [ '1' ]
            right = [ '10' ]
            found_length = False
            length = 1
            while True :
                print ( '? ' , left )
                sys.stdout.flush ( )
                ans1 = sc.next ( )
                assert ans1 == question ( str ( left ) )
                print ( '? ' , right )
                sys.stdout.flush ( )
                ans2 = sc.next ( )
                assert ans2 == question ( str ( right ) )
                if ans1 and not ans2 :
                    found_length = True
                    break
                if length >= 10 :
                    break
                length += 1
                left.append ( '0' )
                right.append ( '0' )
            if DEBUG :
                print ( 'length = ' , length )
            if found_length :
                if DEBUG :
                    print ( 'left = ' , left )
                    print ( 'right = ' , right )
                low = 1
                for i in range ( length - 1 ) :
                    low *= 10
                high = 1
                for i in range ( length ) :
                    high *= 10
                high -= 1
                if DEBUG :
                    print ( 'low = ' , low )
                    print ( 'high = ' , high )
                while high - low > 1 :
                    mid = ( low + high ) // 2
                    print ( '? ' , mid * 10L )
                    sys.stdout.flush ( )
                    ans = sc.next ( )
                    assert ans == question ( mid * 10L )
                    if DEBUG :
                        print ( 'mid = ' , mid )
                        print ( ans )
                    if ans :
                        high = mid
                    else :
                        low = mid
                print ( '! ' , high )
    return Main
