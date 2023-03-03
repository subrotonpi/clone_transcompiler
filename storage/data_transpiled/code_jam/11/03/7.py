def test_clarge ( ) :
    import random
    from time import sleep
    from random import choice
    from os import urandom
    from random import choice
    from os import urandom
    from os import urandom
    from os import urandom
    from random import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.file = urandom ( 512 )
            self.file = urandom ( 512 )
            self.file = urandom ( 512 )
            self.file.write ( "C-large\n" )
            self.solve ( )
        def solve ( self ) :
            tn = randint ( 1 , 10000 )
            for test_n in range ( 1 , tn ) :
                if test_n == 0 :
                    n = randint ( 1 , 10000 )
                    xor = 0
                    sum = 0
                    min = int ( 1e9 )
                    for _ in range ( n ) :
                        c = randint ( 0 , 1e9 )
                        xor ^= c
                        sum += c
                        min = min ( min , c )
                    if xor != 0 :
                        ans = "NO"
                    else :
                        ans = "%d" % ( sum - min )
                    self.out.write ( "Case #%d: %s\n" % ( test_n , ans ) )
        def solve ( self ) :
            return self.file.encode ( "ascii" )
        def solve ( self ) :
            try :
                locale.setlocale ( locale.LC_ALL , '' )
                out = open ( self.file + ".out" , 'w' )
                out.write ( "" )
                out.close ( )
            except :
                pass
    for test_n in range ( 1 , int ( tn ) + 1 ) :
        for test_n in range ( 1 , int ( tn ) + 1 ) :
            if test_n == 0 :
                return
            if test_n == 1 :
                out = open ( self.file + ".in" , 'w' )
                out.write ( "Case #%d: %s\n" % ( test_n , out ) )
                out.close ( )
