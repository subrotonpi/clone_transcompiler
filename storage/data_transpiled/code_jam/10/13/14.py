def import java.io io , open , open , subprocess , shutil , args , conv , count , count , count , args , conv , prog , stdin , stdout , stderr ) :
    from java.io import open , open , subprocess , PIPE , pipes
    from java.io import BufferedReader , PIPE , STDOUT , pipes
    class Number ( object ) :
        def __init__ ( self , stream ) :
            try :
                self.stream = open ( stream , 'r' )
            except :
                pass
        def read ( self ) :
            cas = len ( self.stream.read ( ) )
            for t in range ( 1 , cas + 1 ) :
                fout.write ( 'Case #%d: %s\n' % ( t , process ( self , * t ) ) )
            return
        def process ( self , * args , ** kwargs ) :
            a1 , a2 , b1 , b2 = args
            if a2 >= 1 :
                startpos = [ ]
            if a2 >= 2 :
                startpos = [ ]
            k = 1
            for i in range ( 3 , a2 + 1 ) :
                while i >= startpos [ k ] + k :
                    k += 1
                startpos.append ( k )
            res = 0
            for i in range ( a1 , a2 + 1 ) :
                res += count ( i , b1 , b2 )
            return res
        def count ( self , id , b1 , b2 ) :
            res = b2 - b1 + 1
            if b1 < startpos [ id ] :
                if b2 < startpos [ id ] :
                    return res
                elif b2 < startpos [ id ] + id :
                    return res - ( b2 - startpos [ id ] + 1 )
                else :
                    return res - id
            elif b1 < startpos [ id ] + id :
                if b2 < startpos [ id ] + id :
                    return 0
                else :
                    return b2 - ( startpos [ id ] + id ) + 1
            else :
                return res
    return Number ( )
