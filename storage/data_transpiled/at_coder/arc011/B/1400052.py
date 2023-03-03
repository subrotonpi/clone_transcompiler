def main ( ) :
    import sys
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    from pydevd.operations import recompile
    map = { 'b' : 1 , 'c' : 1 , 'd' : 2 , 'w' : 2 , 't' : 3 , 'j' : 3 , 'f' : 4 , 'q' : 4 , 'l' : 5 , 'v' : 5 , 's' : 6 , 'x' : 6 , 'p' : 7 , 'm' : 7 , 'h' : 8 , 'k' : 8 , 'n' : 9 , 'g' : 9 , 'z' : 0 , 'r' : 0 }
    map1 = recompile.copy ( map )
    for key in map1 :
        k = key [ 0 ]
        k += ( 'A' - 'a' )
        s = str ( k )
        map [ s ] = map [ key ]
    N = recompile.count ( )
    lst = [ ]
    for word in recompile.split ( '' ) [ 1 : ] :
        num = ''
        for s in word :
            s = str ( s )
            if s in map : num += map [ s ]
        if not num in lst :
            lst.append ( num )
    for i , word in enumerate ( lst ) :
        print ( word , end = '' )
        if i < len ( lst ) - 1 : sys.stdout.write ( '' )
