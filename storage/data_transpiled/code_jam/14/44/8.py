def _import ( ) :
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain as chain
    def solve ( ) :
        p = 1
        for i in chain ( chain ( [ i ] , repeat ( p ) ) for i in chain ( [ i ] , repeat ( p ) ) ) :
            p *= n
        a = [ ]
        best_size = - 1
        best_count = 0
        for assign in chain ( [ p ] , repeat ( p ) ) :
            q = assign
            for i in chain ( [ i ] , repeat ( q ) ) :
                a.append ( q % n )
                q //= n
        size = 0
        for i in chain ( [ i ] , repeat ( p ) ) :
            pref = set ( )
            for j in chain ( [ i ] , repeat ( a ) ) :
                if a [ j ] == i :
                    for k in range ( 0 , len ( s [ j ] ) ) :
                        pref.add ( s [ j ] [ : k ] )
            size += len ( pref )
        if size > best_size :
            best_size = size
            best_count = 1
        elif size == best_size :
            best_count += 1
        return best_size , best_count
    def D ( f ) :
        m , n = map ( int , f.split ( '.' ) )
        s = chain ( [ i for i in f.split ( '.' ) ] , repeat ( a ) )
    file_name = re.sub ( r'_.*' , '' , D.__name__ ).lower ( )
    def input_filename ( ) :
        return file_name ( )
    def output_filename ( ) :
        return file_name ( )
    from itertools import chain
    from itertools import chain , chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import chain , repeat
    from itertools import itertools , repeat
    from itertools import itertools as chain , repeat
    from itertools import itertools
    from itertools import itertools import chain , repeat
    from itertools import itertools
    from itertools import itertools import chain , repeat
