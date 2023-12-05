def _import ( ) :
    import collections
    import collections
    import csv
    class Main ( object ) :
        def __init__ ( self ) :
            self.MAPPING = { 22 : 'Christmas Eve Eve Eve' , 23 : 'Christmas Eve Eve' , 24 : 'Christmas Eve' , 25 : 'Christmas' }
        def process ( self ) :
            ( D , ) = self.D
            return self.MAPPING [ D ]
        def process ( self ) :
            case = self._read_from_input ( )
            result = self.process ( case )
            self.output ( result )
        def _read_from_input ( self ) :
            with open ( self.D , 'r' ) as f :
                D = f.read ( )
            return { 'D' : D }
        def output ( self , result ) :
            print ( result )
    class Main ( object ) :
        def __init__ ( self ) :
            self.D = 0
    return Main
