def import _main
class Main ( object ) :
    class TriTree :
        def __init__ ( self ) :
            self.root = Node ( )
        class Node :
            def __init__ ( self , char , depth ) :
                self.root.append ( char )
            def add ( self , node ) :
                self.child.append ( node )
            def add ( self , node ) :
                pass
            def add ( self , node ) :
                pass
            def add ( self , node ) :
                pass
            def add ( self , node ) :
                pass
            def add ( self , node ) :
                pass
            def add ( self , node ) :
                self.child.append ( node )
        def add ( self , node ) :
            self.child.append ( node )
            if len ( self.child ) == 1 :
                self.child ^= self.xor_grundy ( self.L - node.depth )
            return self.child
        def add_leaf ( self , s ) :
            cur = self.root
            for i in range ( len ( s ) ) :
                found = False
                for child in cur.child :
                    if child.char == s [ i ] :
                        cur = child
                        found = True
                        break
                if not found :
                    next = Node ( s [ i ] , i + 1 )
                    cur.add ( next )
                    cur = next
    def xor_grundy ( self ) :
        return self.root.xor_grundy ( self.L )
class L ( object ) :
    def __init__ ( self ) :
        self.N = len ( self.root )
        self.L = len ( self.root )
        tree = TriTree ( )
        for i in range ( N ) :
            tree.add_leaf ( self.root.next ( ) )
        print ( tree.xor_grundy ( ) or 'Bob' )
    def grundy ( self , n ) :
        ans = 1
        while n % ans == 0 :
            ans <<= 1
        return ans
return Main
