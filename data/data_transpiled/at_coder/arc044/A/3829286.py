def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os.path import join
    class Main ( sc ) :
        def __init__ ( self ) :
            sc = getenv ( getenv ( "SC" , getenv ( "SUUJI" , "" ) ) )
            N = sc.randint ( 0 , 100 )
            if not isPrime ( N ) and ( ( N % 3 == 0 or N % 5 == 0 ) or ( N != 2 and N % 2 == 0 ) ) or N == 1 :
                print ( "Not Prime" )
            else :
                print ( "Prime" )
        def isPrime ( a ) :
            if a < 4 :
                if a == 2 or a == 3 :
                    return True
                else :
                    return False
            else :
                for j in range ( 2 , root ( a ) + 1 ) :
                    if a % j == 0 :
                        return False
                    if a % j != 0 and ( j + 1 ) * ( j + 1 ) > a :
                        return True
                return True
    class SC ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.stream = None
        def next ( self ) :
            if not self.stream or not self.stream.readline ( ) :
                try :
                    self.stream = iter ( self.stream )
                except StopIteration :
                    raise SystemExit ( )
            return self.stream.readline ( )
        def next ( self ) :
            return self.stream.readline ( )
        def __next__ ( self ) :
            return int ( self.stream.readline ( ) )
        def next ( self ) :
            return next ( self.stream.readline ( ) )
        def next ( self ) :
            return next ( self.stream.readline ( ) )
    class root ( sc ) :
        def __init__ ( self , stream = getenv ( "SC" , getenv ( "SUUJI" , "" ) ) ) :
            self.stream = stream
            self.stream = None
            self.next = None
        