def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        m = sc.number
        graph = [ [ ] for i in range ( 1 , n + 1 ) ]
        for i in range ( m ) :
            a = _main ( )
            b = _main ( )
            graph [ a ].append ( b )
            graph [ b ].append ( a )
        seen = set ( )
        lst = [ ]
        idx = 1
        flag = False
        lst.append ( idx )
        seen.add ( idx )
        while not flag :
            flag = True
            for x in graph [ idx ] :
                if x not in seen :
                    flag = False
                    idx = x
                    lst.append ( idx )
                    seen.add ( idx )
                    break
        lst = [ ]
        for i , x in enumerate ( lst ) :
            if i != 0 :
                lst.append ( " " )
            lst.append ( x )
        print ( lst )
