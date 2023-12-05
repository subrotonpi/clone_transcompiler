def _import ( ) :
    from os import system , PIPE , I , O
    from os.path import join , dirname , dirname , basename
    class Main ( object ) :
        def __init__ ( self ) :
            sc = SC ( sys.stdin )
            he = sc.uniform ( 0 , 100 ) / 100
            BMI = sc.uniform ( 0 , 100 )
            self.pl ( BMI * he ** 2 )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.readline = None
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = list ( self.readline ( ) )
                except ValueError :
                    raise StopIteration
            return self.tokens [ 0 ]
        def randint ( self ) : return int ( self.randint ( 0 , 100 ) )
        def long ( self ) : return long ( self.long )
        def uniform ( self ) : return float ( self.uniform ( 0 , 100 ) )
        def readline ( self ) :
            try :
                return self.readline ( )
            except ValueError :
                raise StopIteration
    def pl ( x ) :
        print ( x )
    def p ( x ) :
        print ( x , end = '' )
    def isPrime ( a ) :
        if a < 4 :
            if a == 2 or a == 3 :
                return True
            else :
                return False
        else :
            for j in range ( 2 , 2 * j , a + 1 ) :
                if a % j == 0 :
                    return False
                if a % j != 0 and ( j + 1 ) * ( j + 1 ) > a :
                    return True
            return True
