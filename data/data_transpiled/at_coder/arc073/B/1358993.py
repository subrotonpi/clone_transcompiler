def import _sys
class Main ( object ) :
    MOD = 109 + 7
    def __init__ ( self , mod ) :
        with open ( self.mod , 'r' ) as sc :
            n = sc.read ( )
            limit_w = sc.read ( )
            w = [ ]
            v = [ ]
            for i in range ( n ) :
                w.append ( sc.read ( ) )
                v.append ( sc.read ( ) )
            knapsack = _sys.knapsack ( n , limit_w , w , v )
            print ( knapsack.calc ( ) )
    class Knapsack ( object ) :
        def __init__ ( self , n , limit_w , w , v ) :
            self.n = n
            self.limit_w = limit_w
            self.items = [ ]
            for i in range ( n ) :
                self.items.append ( ( w [ i ] , v [ i ] ) )
        def calc ( self ) :
            self.items = [ ]
            self.items.sort ( )
            self.dict = { }
            self.dict [ None ] = None
            for item in self.items :
                cur_dict = { }
                for key in self.dict :
                    weight = key + item.w
                    value = self.dict [ key ] + item.v
                    if weight <= limit_w :
                        cur_dict [ weight ] = value
                for key in cur_dict :
                    if key in self.dict :
                        self.dict [ key ] = max ( cur_dict [ key ] , self.dict [ key ] )
                    else :
                        self.dict [ key ] = cur_dict [ key ]
            return max ( self.dict.values ( ) )
    class Item ( object ) :
        def __init__ ( self , w , v ) :
            self.w = w
            self.v = v
        def getEfficiency ( self ) :
            return 1.0 * self.v / w
        @ classmethod
        def eval ( self , o ) :
            return o.eval ( )
    return Main
