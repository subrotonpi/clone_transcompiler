def _import ( ) :
    from math import ceil
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os.path import join
    class R1B :
        def __init__ ( self , val ) :
            prblm = 'B'
            fl = True
            filein = '%s-%s.in.txt' % ( prblm , getenv ( 'large' ) )
            fileout = '%s-%s.out.txt' % ( prblm , getenv ( 'large' ) )
        def write ( self , i , v ) :
            self.val = v
            self.en [ i ] = self.en [ i ]
            self.en2 [ i + 1 ] = self.pos
            self.val += long ( v ) * ( self.pre - pos )
    print ( 'Case #%d: %d\n' % ( i , val ) )
    with open ( filein ) as fr :
        with open ( fileout , 'w' ) as fw :
            s = fr.readline ( )
            T = int ( s )
            for i in range ( 1 , T + 1 ) :
                s = fr.readline ( )
                tok = s.split ( )
                E = int ( tok [ 0 ] )
                R = int ( tok [ 1 ] )
                N = int ( tok [ 2 ] )
                s = fr.readline ( )
                tok = s.split ( )
                en = [ ]
                en2 = [ ]
                en2.append ( E )
                en.append ( 0 )
                tr = { }
                for j in range ( N + 1 ) :
                    v = int ( tok [ j ] )
                    if v in tr :
                        ar = tr [ v ]
                        ar.append ( j )
                    else :
                        ar = [ ]
                    tr [ v ] = ar
            tt = int ( ceil ( float ( E ) / R ) )
            val = 0
            for v in tr.descending_keys ( ) :
                ar = tr [ v ]
                if v in en :
                    en [ v ] = self.en [ v ] + 1
                    val += long ( en [ v ] ) * ( self.pre - pos )
                