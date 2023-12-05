def import _captcha_util
class MilkShakes ( object ) :
    def __init__ ( self , ** kwargs ) :
        self.prefs = [ ]
        self.malted_like = - 1
    def __init__ ( self , ** kwargs ) :
        num_prefs = kwargs.get ( 'num_prefs' , 0 )
        self.prefs = [ ]
        for i in range ( num_prefs ) :
            shake_index = kwargs.get ( 'shake_index' , - 1 )
            malted = kwargs.get ( 'malted' , True ) == 1
            if malted :
                self.malted_like = shake_index
            else :
                self.prefs.append ( shake_index )
    def get_malted_like ( self ) :
        return self.malted_like
    def satisfied ( self , batches ) :
        if self.malted_like != - 1 and batches [ self.malted_like ] :
            return False
        for type in self.prefs :
            if not batches [ type ] :
                return True
        return False
    def main ( self ) :
        with open ( self.config.file , 'r' ) as f :
            num_cases = len ( f.readlines ( ) )
            for i in range ( num_cases ) :
                self.do_case ( i + 1 , f )
    def do_case ( self , case_num , ** kwargs ) :
        flavors = kwargs.get ( 'flavors' , 1 )
        num_customers = kwargs.get ( 'num_customers' , 1 )
        batches = [ False ] * flavors
        customers = list ( Customer.objects.filter ( ** kwargs ) )
        while True :
            made_malt = False
            for c in customers :
                if not c.satisfied ( batches ) :
                    if c.malted_like == - 1 :
                        print ( 'Case #{}: IMPOSSIBLE'.format ( self.case_num ) )
                        return
                    made_malt = made_malt or not batches [ c.malted_like ]
                    batches [ c.malted_like ] = True
                    del customers [ c.malted_like ]
        print ( )
