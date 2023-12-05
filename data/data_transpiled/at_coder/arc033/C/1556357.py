def _main ( ) :
    import os
    import sys
    import os
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.key = None
        def insert ( self ) :
            if self.root is None :
                self.root = Node ( self.key , None )
                return True
            cur = self.root
            while True :
                self.key = self.cur.key
                self.cur = self.cur.left
                self.cur = self.cur.right
                if self.cur is None :
                    self.cur = self.cur.left
                else :
                    self.cur = self.cur.right
            return True
        def reheight ( self ) :
            if self.cur.key == self.key :
                self.height = 1 + max ( self.cur.right , self.cur.left )
            else :
                self.cur = self.cur.right
        def insert ( self , node ) :
            self.cur = self.cur.left
            self.cur = self.cur.right
            if self.cur is None :
                self.cur.left = self.cur.right
            else :
                self.cur.right = self.cur.right
        def rebalance ( self ) :
            if self.cur.right is not None :
                self.cur.right = self.cur.left
            else :
                self.cur.right = self.cur.right
        def rebalance ( self ) :
            if self.cur.left is not None :
                self.cur.right = self.cur.left
            else :
                self.cur.right = self.cur.right
        def rebalance ( self ) :
            if self.cur.right is not None :
                self.cur.right = self.cur.left
            else :
                self.cur.right = self.cur.right
        def rebalance ( self ) :
            self.cur.right = self.cur.right
            self.cur.left = self.cur.left
    def rebalance ( self ) :
        if self.cur.right is not None :
            self.cur.right = self