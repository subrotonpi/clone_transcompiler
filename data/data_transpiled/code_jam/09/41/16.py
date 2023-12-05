def _import ( ) :
    from cStringIO import StringIO
    import csv
    class A ( object ) :
        def __init__ ( self ) :
            self.IFILE = "A-large.in"
            self.infile = StringIO ( )
            self.outfile = StringIO ( )
            self.ntest = len ( csv.reader ( open ( IFILE ) ) )
        def run ( self ) :
            f = csv.reader ( open ( IFILE ) )
            self.outfile = open ( "output.txt" , "w" )
            self.ntest = len ( csv.reader ( open ( IFILE ) ) )
            for test in range ( 1 , ntest + 1 ) :
                print ( "Case #%d: " % test , end = ' ' )
                n = len ( csv.reader ( open ( IFILE ) ) )
                f.next ( )
                mas = [ ]
                for i in range ( n ) :
                    c = csv.reader ( open ( IFILE ) )
                    for j in range ( n ) :
                        if c [ j ] == '1' :
                            mas.append ( j )
                res = 0
                for i in range ( n ) :
                    pos = 0
                    for j in range ( i , n ) :
                        if mas [ j ] <= i :
                            pos = j
                            break
                        res += pos - i
                        for j in range ( pos , i , n - 1 ) :
                            mas [ j ] = mas [ j - 1 ]
                print ( res , end = ' ' )
            f.next ( )
            f.close ( )
    return A
