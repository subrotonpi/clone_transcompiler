def _import ( ) :
    import os
    import sys
    import os
    import os
    import sys
    import os
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.id = self.id
            self.width = self.width
            self.height = self.height
        def find_binary_search_tree ( self , key ) :
            sc = os.popen ( "/usr/bin/search --max-width=%d" % self.width )
            self.width = self.width
            self.height = self.height
            self.height = self.height
        def update_binary_search_tree ( self , node ) :
            if self.width >= self.width :
                self.width = self.width
            else :
                self.height = self.height
        def update_binary_search_tree ( self , node ) :
            if self.width >= self.width :
                self.width = self.width
            else :
                self.height = self.height
        def update_binary_search_tree ( self , node ) :
            if self.height >= self.height :
                self.height = self.height
            else :
                self.height = self.height
        def update_binary_search_tree ( self , node ) :
            if self.width >= self.height :
                self.width = self.width
            else :
                self.height = self.height
    widarray = [ ]
    widarray.sort ( )
    root = create_tree ( 0 , len ( widarray ) - 1 )
    boxes = [ ]
    dp = [ 1 ]
    root = update_binary_search_tree ( root , ( boxes [ 0 ].width , dp [ 0 ] ) )
    for box in boxes [ 1 : ] :
        node = find_binary_search_tree ( root , box.width )
        dp.append ( node.height or 1 )
        root = update_binary_search_tree ( root , ( box.width , dp [ 1 ] ) )
    ans = 0
    for d in dp :
        ans = max ( ans , d )
    print ( ans )
