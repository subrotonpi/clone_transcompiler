def _import_write ( buffer ) : return buffer
class MyInput ( io.FileIO ) :
    def __init__ ( self , to , edgeId ) : self.to = to
    self.edgeId = edgeId
    def __str__ ( self ) : return '[Edge id=%d, to=%d]' % ( self.edgeId , to )
class ArrayAlgorithms ( io.FileIO ) :
    def __init__ ( self , ary ) :
        self.ary = [ ]
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
        self.ary.append ( '-' * ( 256 - len ( ary ) ) )
    def read ( self ) :
        self.ary = [ ]
        self.ary.append