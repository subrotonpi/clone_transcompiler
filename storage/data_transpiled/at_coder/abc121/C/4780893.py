def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.read ( ) )
            self.m = int ( sys.stdin.read ( ) )
            self.store_list = [ ]
            for i in range ( self.n ) :
                price = self.price
                amount = self.amount
                store = Store ( price , amount )
                self.store_list.append ( store )
            self.store_list.sort ( key = lambda a : a.price )
            money = 0
            drink_amount = 0
            for store in self.store_list :
                if drink_amount + store.amount >= m :
                    money += store.price * ( m - drink_amount )
                    break
                money += store.price * store.amount
                drink_amount += store.amount
            print ( money )
    class Store ( object ) :
        def __init__ ( self , p , a ) :
            self.price = p
            self.amount = a
    return Main ( )
