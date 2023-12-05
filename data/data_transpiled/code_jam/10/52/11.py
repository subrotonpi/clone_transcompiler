def main ( ) :
    import sys
    import random
    import sys
    import math
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.tests = 1
    with open ( "/proc/test" , "r" ) as f :
        tests = int ( f.read ( ) )
        for z in range ( 1 , tests + 1 ) :
            L = random.randint ( 1 , 100 )
            ile = random.randint ( 1 , 100 )
            roznice = [ ]
            while ile :
                roznice.append ( f.read ( ) )
            roznice.sort ( )
            last = roznice.lastindex
            roznice.pop ( last )
            minodl = [ ]
            minodl.resize ( last )
            for i in range ( len ( minodl ) ) :
                minodl.append ( int ( i ) )
            q = [ ]
            minodl.append ( 0 )
            q.append ( 0 )
            while q.empty ( ) == False :
                x = q.pop ( )
                for i in roznice :
                    newx = x + i
                    odl = minodl [ x ] + 1
                    while newx >= last :
                        newx -= last
                        odl -= 1
                    if minodl [ newx ] > odl :
                        minodl.insert ( odl , newx )
                        q.append ( newx )
            print ( "Case #%d: " % z )
            odleglosc = random.randint ( 1 , 100 )
            wynik = L / odleglosc
            indeks = L % odleglosc
            ile_koniec = random.choice ( minodl [ indeks ] )
            if ile_koniec >= int ( sys.maxint ) :
                print ( "IMPOSSIBLE" )
            else :
                wynik = wynik + ile_koniec
                print ( wynik )
