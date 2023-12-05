def _import ( ) :
    import sys
    import os
    import sys
    import os
    import sys
    import itertools
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    MOD = 1000000007
    def main ( args ) :
        yield args
    def top_sort ( node , graph , stack ) :
        visited = [ ]
        for neighbor in graph [ node ] :
            if not visited [ neighbor ] :
                top_sort ( neighbor , graph , stack )
        stack.push ( node )
    class FastReader ( ) :
        def readline ( ) :
            while not isinstance ( readline , str ) or readline.startswith ( '#' ) :
                try :
                    readline = readline ( )
                except EOFError :
                    pass
            return readline.strip ( )
        def readline ( ) :
            return int ( readline ( ) )
        def readline ( ) :
            return readline ( )
        def readline ( ) :
            while not isinstance ( readline , str ) or readline.startswith ( '#' ) :
                readline = readline ( )
            return readline.strip ( )
        def readline ( ) :
            while not isinstance ( readline , str ) or readline.startswith ( '#' ) :
                readline = readline ( )
            return readline.strip ( )
        def readline ( ) :
            while not isinstance ( readline , str ) or readline.startswith ( '#' ) :
                readline = readline ( )
            return readline.strip ( )
        def readline ( ) :
            while not isinstance ( readline , str ) or readline.startswith ( '#' ) :
                readline = readline ( )
            return readline.strip ( )
    graph = [ list ( ) for i in chain ( * reversed ( graph ) ) ]
    for i in range ( m ) :
        graph [ i ].append ( i )
        graph [ i ].append ( i )
    visited = [ ]
    distances = { }
    queue = [ a ]
    while not queue.empty ( ) :
        node = queue.pop ( )
        for neighbor in graph [ node ] :
            if distances [ neighbor ] == 0 :
                continue
            distances [ neighbor ] = distances [ node ] + 1
            queue.push ( neighbor )
    [ a ] = 1
    