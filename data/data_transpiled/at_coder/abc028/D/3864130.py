def _import ( ) :
    from os import system , AF_INET , SOCK_STREAM , SOCK_DGRAM
    from os.path import join
    from os import sep , SOCK_DGRAM
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join , dirname , dirname , basename
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.__next__ ( )
            K = sc.__next__ ( )
            souwa = N * N * N
            kotae = 0
            if N >= K :
                if K - 1 and N - K > 0 :
                    kotae += ( K - 1 ) * ( N - K ) * 6
                if N - K > 0 :
                    kotae += 3 * ( N - K )
                if K - 1 > 0 :
                    kotae += ( K - 1 ) * 3
                kotae += 1
                ans = ( float ( kotae ) / float ( souwa ) )
                self.pl ( ans )
            else :
                self.pl ( 0 )
    class SC ( object ) :
        def __init__ ( self , stream = None ) :
            self.stream = stream
            self.tokens = [ ]
        def readline ( self ) :
            if not stream or not stream.readline ( ) :
                try :
                    stream = open ( stream , 'r' )
                except IOError :
                    raise OSError ( "Cannot read file %r" % stream )
            return stream.readline ( )
        def pl ( self , x ) :
            print ( x )
        def p ( self , x ) :
            print ( x , end = ' ' )
    return SC
