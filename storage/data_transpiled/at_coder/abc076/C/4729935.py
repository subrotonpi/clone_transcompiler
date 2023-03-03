def _import ( ) :
    import re
    import re
    class Main ( object ) :
        def __init__ ( self ) :
            self.s , t = self.s.split ( '.' )
            self.match = re.match ( '(.*)' + t.replace ( '.' , '[$0?]' ) + '(.*?)' , s )
            self.print ( self.match.group ( 1 ).replace ( '$1' , '$2' ).replace ( '?' , 'a' ) if self.match else 'UNRESTORABLE' )
