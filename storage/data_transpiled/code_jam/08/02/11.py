def _import ( s ) : return int ( s [ 0 : 2 ] ) * 60 + int ( s [ 3 : ] )
def gettime ( s ) : return int ( s [ 0 : 2 ] ) * 60 + int ( s [ 2 : ] )
def _train_timetable ( s ) :
    f = open ( 'B-large.in' , 'r' )
    f.write ( 'B.out\n' )
    n = int ( f.readline ( ) )
    for t in range ( n ) :
        T = int ( f.readline ( ) )
        e = f.readline ( ).split ( )
        na = int ( e [ 0 ] )
        nb = int ( e [ 1 ] )
        adep = list ( )
        bdep = list ( )
        aarr = list ( )
        barr = list ( )
        for i in range ( na ) :
            q = f.readline ( ).split ( )
            adep.append ( gettime ( q [ 0 ] ) )
            aarr.append ( gettime ( q [ 1 ] ) )
        for i in range ( nb ) :
            q = f.readline ( ).split ( )
            bdep.append ( gettime ( q [ 0 ] ) )
            barr.append ( gettime ( q [ 1 ] ) )
        adep.sort ( )
        bdep.sort ( )
        aarr.sort ( )
        barr.sort ( )
        for z in aarr :
            for x in bdep :
                if z + T <= x :
                    del adep [ z ]
                    break
            for z in barr :
                for x in adep :
                    if z + T <= x :
                        del adep [ z ]
                        break
    return adep , bdep , aarr , barr
