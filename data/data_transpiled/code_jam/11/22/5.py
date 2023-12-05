def import readline , sys ) :
    import readline
    import sys
    class B ( object ) :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
        def __next__ ( self ) :
            return int ( self.a )
        def __next__ ( self ) :
            return int ( self.b )
        def nextDouble ( self ) :
            return float ( self.b )
    def solve ( ) :
        c = randint ( )
        d = randint ( ) * 2
        p = [ ]
        vendors = 0
        for i in range ( c ) :
            p.append ( ( 2 * randint ( ) , nextInt ( ) ) )
            vendors += p [ i ].b
        l , r = - 1 , int ( ) // 2
        while r - l > 1 :
            m = ( r + l ) >> 1
            if check ( p , d , m ) :
                r = m
            else :
                l = m
        res = ( r // 2 ) + '.' + ( '0' if r % 2 == 0 else '5' )
        sys.stdout.write ( res )
    def check ( p , d , time ) :
        n = len ( p )
        last = int ( )
        for i in range ( n ) :
            pos = p [ i ].a - time
            pos = max ( pos , last + d )
            right = pos + int ( p [ i ].b - 1 ) * d
            if right - p [ i ].a > time :
                return False
            last = right
        return True
    def main ( ) :
        with open ( 'B-%s.in' % ( 'large' if large else 'small' ) , 'r' ) as f :
            lines = f.readlines ( )
            if isinstance ( lines , list ) :
                lines = lines [ : - 1 ]
            else :
                lines = lines
    large = True
    try :
        fname = 'B-%s.in' % ( 'large' if large else 'small' )
    except NameError :
        fname = 'B-%s.in' % ( fname , )
    f = open ( fname + '.out' ,