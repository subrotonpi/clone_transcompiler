def _import ( ) :
    from os import listdir
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.p = 0
            self.l = 0
            self.n = 0
        def run ( self ) :
            for inf in ( os.listdir ( "." ) or [ ] ) :
                if inf.startswith ( "A-" ) and inf.endswith ( ".in" ) :
                    print ( "Processing %s:" % inf )
                    try :
                        f = open ( inf )
                        ouf = open ( inf.rstrip ( ".in" ) , "w" )
                        f.write ( "".join ( [ "%s %s" % ( x , y ) for x , y in zip ( f.readlines ( ) , f.readlines ( ) ) ] ) )
                        f.close ( )
                        f = None
                        self.eof = False
                        self.solve ( )
                    except ( IOError , OSError ) :
                        sys.exit ( - 1 )
                    else :
                        f.close ( )
        def readline ( self ) :
            while not f or not f.readline ( ) :
                try :
                    f.readline ( )
                except :
                    eof = True
                    return "0"
            return f.readline ( )
        def randint ( self , n ) :
            return int ( self.p )
        def uniform ( self , size ) :
            return float ( self.n )
        def solve ( self ) :
            test_count = self.randint ( 1 , size )
            for test_number in range ( 1 , test_count + 1 ) :
                print ( "%s / %d: " % ( test_number , test_count ) , end = ' ' )
                print ( "Case #%d: " % test_number , end = ' ' )
                n = self.randint ( 1 , n )
                g = [ ]
                for i in range ( n ) :
                    g.append ( ( - 1 , randint ( 1 , n ) ) )
                for i in range ( n ) :
                    g [ i ].p = randint ( 1 , n )
                g.sort ( )
                for l in g :
                    print ( " SPACETOKEN