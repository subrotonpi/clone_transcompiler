def import _import_string
class A ( object ) :
    def __init__ ( self , s ) :
        hm = { }
        def id ( self , x ) :
            if re.match ( '[a-z]+' , x ) : return - 1
            if self in hm : return hm [ self ]
            else : hm [ self ] = X
            return self
        X += 1
    def go ( self , id ) :
        if id == - 1 : return - 1000000
        cnt = [ ]
        mixes = 0
        for i in range ( len ( self.ls [ id ] ) ) :
            if self.ls [ id ] [ i ] >= 0 : mixes += 1
            cnt.append ( go ( self.ls [ id ] [ i ] ) )
        cnt.sort ( )
        ret = 1
        for i in range ( len ( cnt ) ) :
            ret = max ( ret , cnt [ i ] + len ( cnt ) - i - 1 )
        return max ( ret , mixes + 1 )
    def main ( self ) :
        with open ( self.config.get ( 'C' , '' ) , 'r' ) as f :
            for i in range ( self.C ) :
                self.hm = { }
                X = 0
                N = len ( f.read ( ) )
                ls = [ ]
                for id1 in range ( self.ls [ id1 ] ) :
                    ls.append ( [ id ( s = f.read ( ) ) ] )
                ls = [ ]
                for s in ls :
                    ls.append ( s )
                req = go ( 0 )
                print ( "Case #%d: %d\n" % ( self.i + 1 , req ) )
