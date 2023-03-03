def import _Node
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def Scanner ( sc , n , m ) :
        self.dp = [ ]
        self.dp = [ ]
        self.dp = [ ]
        self.dp = [ ]
        self.contains = [ False for _ in range ( n ) ]
        for a in range ( m ) :
            b = sc.randint ( 0 , m ) - 1
            self.dp [ a ].nexts.append ( self.dp [ b ] )
            self.dp [ b ].nexts.append ( self.dp [ a ] )
        path = list ( range ( self.dp [ 0 ].a , self.dp [ 0 ].nexts.count ( ) ) )
        for i in path :
            self.contains.append ( True )
        flag = True
        while flag :
            flag = False
            first = path [ 0 ]
            for node in self.dp [ first ].nexts :
                if self.contains [ node.a ] :
                    continue
                self.contains [ node.a ] = True
                self.dp.append ( node.a )
                flag = True
                break
            last = path [ - 1 ]
            for node in self.dp [ last ].nexts :
                if self.contains [ node.a ] :
                    continue
                self.contains [ node.a ] = True
                self.dp.append ( node.a )
                flag = True
                break
        print ( len ( self.dp ) )
        for i in self.dp :
            print ( ( i + 1 ) , end = ' ' )
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
        self.dp = set ( )
    def __init__ ( self , a ) :
        self.dp = [ ]
        self.dp = set ( )
    def __eq__ ( self , x ) :
        if self.dp == [ ] or self.__class__ != Node :
            return False
        self.dp = [ ]
return Main
