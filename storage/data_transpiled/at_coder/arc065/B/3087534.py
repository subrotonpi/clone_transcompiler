def _import ( ) :
    from itertools import count , repeat
    class Pair ( E , F ) :
        def __init__ ( self , first , second ) :
            self.first = first
            self.second = second
        def first ( self ) :
            return self.first
        def second ( self ) :
            return self.second
        def __str__ ( self ) :
            return "<%s,%s>" % ( self.first , self.second )
        def __hash__ ( self ) :
            return self.first.__hash__ ( ) * 30011 + self.second.__hash__ ( ) + 2
        def __eq__ ( self , obj ) :
            if self == obj : return True
            if not isinstance ( obj , tuple ) : return False
            if __class__ ( obj ) != type ( obj ) : return False
            another = obj
            return self.first == another [ 0 ] and self.second == another [ 1 ]
    class Counter ( object ) :
        def __init__ ( self ) :
            self.Counter = Counter
        def __getitem__ ( self , elm ) : return self.getOrDefault ( elm , 0 )
        def add ( self , elm ) : self.Counter [ elm ] = self.get ( elm ) + 1
    class UnionFind ( Counter ) :
        def __init__ ( self ) :
            self.size = self.size
            self.parent = [ ]
            self.height = [ ]
            for i in range ( self.size ) :
                self.parent.append ( i )
                self.height.append ( 0 )
        def isRoot ( self , node ) :
            return node == self.parent [ node ]
        def getRoot ( self ) :
            if self.isRoot ( node ) : return node
            else :
                self.parent [ node ] = getRoot ( self.parent [ node ] )
                return self.parent [ node ]
        def union ( self , node1 , node2 ) :
            if self.height [ node1 ] > self.height [ node2 ] :
                self.parent [ getRoot ( node2 ) ] = getRoot ( node1 )
            else :
                self.parent [ getRoot ( node1 ) ] = getRoot ( node2 )
        def find ( self , node1 , node2 ) :
            return self.parent [ node1 ] == self.parent [ node2