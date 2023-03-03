def pl.helman.codejam.speaking ( ) :
    import os
    import sys
    import os
    import os
    import sys
    class Speaking ( object ) :
        def __init__ ( self ) :
            self.tab = [ ]
        def __init__ ( self ) :
            self.tab.append ( 'y' )
            self.tab [ 'a' ] = 'n'
            self.tab [ 'b' ] = 'f'
            self.tab [ 'c' ] = 'i'
            self.tab [ 'd' ] = 'e'
            self.tab [ 'w' ] = 'f'
            self.tab [ 'l' ] = 'g'
            self.tab [ 'b' ] = 'h'
            self.tab [ 'k' ] = 'i'
            self.tab [ 'u' ] = 'j'
            self.tab [ 'o' ] = 'k'
            self.tab [ 'm' ] = 'l'
            self.tab [ 'x' ] = 'm'
            self.tab [ 's' ] = 'n'
            self.tab [ 'e' ] = 'o'
            self.tab [ 'v' ] = 'p'
            self.tab [ 'z' ] = 'q'
            self.tab [ 'p' ] = 'r'
            self.tab [ 'd' ] = 's'
            self.tab [ 'r' ] = 't'
            self.tab [ 'j' ] = 'u'
            self.tab [ 't' ] = 'w'
            self.tab [ 'g' ] = 'v'
            self.tab [ 'h' ] = 'x'
            self.tab [ 'a' ] = 'y'
            self.tab [ 'q' ] = 'z'
            self.tab [ ' ' ] = ' '
        def transform ( self , inp ) :
            s = self.tab [ inp ]
            return s
    def main ( ) :
        fr = open ( 'd:\\speaking.in' , 'r' )
        lines = fr.readlines ( )
        f0 = open ( 'd:\\speaking.out' , 'w' )
        n = int ( lines [ 0 ].strip ( ) )
        for i in range