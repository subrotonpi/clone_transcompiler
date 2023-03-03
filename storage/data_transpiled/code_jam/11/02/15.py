def _import ( ) :
    from os import path
    from .import input
    from .import Magicka
    class Magicka ( object ) :
        def __init__ ( self , caseno ) :
            self.caseno = caseno
            self.caseno = self.caseno
    output = input ( ).split ( ',' )
    print ( 'Case #%d: %s' % ( caseno , ', '.join ( output ) ) )
    class Element :
        def __init__ ( self , o ) :
            self.caseno = self.caseno
            self.oppositions = [ ]
        def add_opposition ( self , other , to ) :
            self.oppositions.append ( o )
        def transform_with ( self , c ) :
            return self.oppositions [ c ]
    class Opposition :
        def __init__ ( self , o ) :
            self.oppositions = [ ]
        def add_opposition ( self , other , to ) :
            self.oppositions.append ( o )
        def transform_with ( self , c ) :
            return self.oppositions [ c ]
    input ( )
    n_combos = input ( ).count ( ',' )
    for i in range ( n_combos ) :
        combo = input ( ).split ( ',' )
        if len ( combo ) != 3 :
            raise RuntimeError ( 'Bad input' , n_combos )
        left , right , transform = combo
        elements [ left - 'A' ].add_tranform ( right , transform )
        elements [ right - 'A' ].add_tranform ( left , transform )
    n_oppositions = input ( ).count ( ',' )
    for i in range ( n_oppositions ) :
        oppose = input ( ).split ( ',' )
        if len ( oppose ) != 2 :
            raise RuntimeError ( 'Bad input' , n_oppose )
        left , right , transform = oppose
        elements [ left - 'A' ].add_opposition ( right , transform )
        elements [ right - 'A' ].add_opposition ( left , transform )
    n_invokes = input ( ).count ( ',' )
    args = [ ]
    invokes