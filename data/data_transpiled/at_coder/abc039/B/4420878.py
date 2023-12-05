def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def solve ( self ) :
            n = randint ( 0 , 200 )
            ans = - 1
            for i in range ( 1 , 200 ) :
                if int ( random.randrange ( i , 4 ) ) == n :
                    ans = i
            self.write ( ans )
    class Main ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            super ( Main , self ).__init__ ( f )
            self.f.flush ( )
    maxInt , minInt = int , int
    mod = 1000000007
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    f = sys.stdin
    buffer = ''
    length , p = 0 , 0
    def has_next_byte ( ) :
        if p < length :
            return True
        else :
            p = 0
            try :
                length = f.read ( p )
            except :
                pass
            if length == 0 :
                return False
            return True
    def read_byte ( ) :
        if has_next_byte ( ) == True :
            return buffer [ p ]
        p += 1
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( ) :
        while has_next_byte ( ) and not is_printable ( buffer [ p ] ) :
            p += 1
    def next ( ) :
        skip ( )
        return has_next_byte ( )
    def read ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        lines = [ ]
        temp = read_byte ( )
        while is_printable ( temp ) :
            lines.append ( temp )
            temp = read_byte ( )
        return ''.join ( lines )
    def randint ( ) :
        return random.randrange ( 1 , n )
    def next_ints ( ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( randint ( 1 , n ) )
        return ar
