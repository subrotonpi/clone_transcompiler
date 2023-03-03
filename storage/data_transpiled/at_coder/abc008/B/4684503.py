def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        dict = { }
        for name in sc.split ( ) :
            c = dict [ name ] if name in dict else 0
            dict [ name ] = c + 1
    max = 0
    ans = ''
    for str in dict :
        if max < dict [ str ] :
            max = dict [ str ]
            ans = str
    print ( ans )
