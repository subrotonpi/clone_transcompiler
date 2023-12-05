def _import ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.g , self.rev = [ ] , [ ]
        def next ( self ) :
            while self.g is None or not self.g.readline ( ) :
                try : self.g = [ self.g.readline ( ) ]
                except IndexError : pass
            return self.g.pop ( )
        def randint ( self , n ) :
            return int ( self.g.pop ( ) )
        def uniform ( self , n ) :
            return float ( self.g.pop ( ) )
        def readline ( self ) :
            return readline ( self )
    Note :./ main.py.uses.unsafe.operations.Recompile : with - Xlint.details.Recompile :
    for line in sys.stdin :
        line = line.decode ( 'utf-8' )
        try :
            data = line.readline ( )
        except EOFError : pass
    while len ( line ) > 0 :
        top = q.pop ( )
        v = int ( top ) & 0x1ffff
        dist = top >> 17
        if d [ v ] <= dist : continue
        d [ v ] = dist
        for e in g [ v ] :
            w = int ( e >> 32 )
            c = int ( e )
            if d [ w ] <= dist + c : continue
            d [ w ] = dist + c + 1
            q.append ( ( dist + c ) << 17 | w )
    return d
