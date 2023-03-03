def _import ( ) :
    import sys
    import csv
    class Main ( object ) :
        def __init__ ( self , nval ) :
            self.nval = nval
        def __next__ ( self ) :
            self.nval = int ( self.nval )
        def __next__ ( self ) :
            self.nval += 1
    def main ( ) :
        out = csv.writer ( sys.stdout )
        inp = csv.reader ( inp )
        tests = next ( inp )
        for test in range ( 1 , tests + 1 ) :
            n = next ( inp )
            a = [ next ( inp ) for _ in range ( n ) ]
            b = [ next ( inp ) for _ in range ( n ) ]
            more = [ False ] * n
            last = [ - 1 ] * n
            for i in range ( n ) :
                if a [ i ] != 1 :
                    more [ i ] [ last [ a [ i ] - 1 ] ] = True
                for j in range ( i ) :
                    if a [ j ] >= a [ i ] :
                        more [ j ] [ i ] = True
                    last [ a [ i ] ] = i
            last = [ - 1 ] * n
            for i in range ( n - 1 , - 1 , - 1 ) :
                if b [ i ] != 1 :
                    more [ i ] [ last [ b [ i ] - 1 ] ] = True
                for j in range ( i + 1 , n ) :
                    if b [ j ] >= b [ i ] :
                        more [ j ] [ i ] = True
                    last [ b [ i ] ] = i
            morec = [ False ] * n
            for i in range ( n ) :
                if not take [ i ] and morec [ i ] :
                    morec [ i ] += 1
        x = [ ]
        take = [ False ] * n
        for i in range ( 1 , n + 1 ) :
            if take [ i ] :
                take [ i ] = True
        out.writerow ( x )
    return Main
