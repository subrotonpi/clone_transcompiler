def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin
        def __call__ ( self ) :
            n = self.s.read ( )
            if n == 1 :
                print ( "Not Prime" )
                return
            for i in range ( 2 , 2 ** i + 1 ) :
                if n % i == 0 :
                    if n % 2 == 0 or n % 5 == 0 :
                        print ( "Not Prime" )
                        return
                    sum = 0
                    while n != 0 :
                        sum += n % 10
                        n /= 10
                    print ( "Not Prime" if sum % 3 == 0 else "Prime" )
                    return
            print ( "Prime" )
