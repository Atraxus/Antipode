public class ImageProcessing {

    public static void main(String []args) {        
    	if (args.length == 0) {
            System.out.println("Fehler: Keinen Parameter angegeben!");
            return;
        }
        String image_name = args[0];
        String filter_name = args[1];
        int filter_size = Integer.parseInt(args[2]);
        
        Picture image = new Picture(image_name);
        
        AbstractFilter filter;
        
        switch (filter_name) {
            case "Identity" :
                filter = new IdentityFilter(filter_size);
                filter.printFilter();
                filter.process(image).show();
                break;
            case "MotionBlur" : 
                filter = new MotionBlurFilter(filter_size);
                filter.printFilter();
                filter.process(image).show();
                break;
                
            case "Sharpen" :
                filter = new SharpenFilter(filter_size);
                filter.printFilter();
                filter.process(image).show();
                break;

            case "Edge" : 
                filter = new EdgeFilter(filter_size);
                filter.printFilter();
                filter.process(image).show();
                break;
                
            /*case "GaussianBlur" : 
                filter = new GaussianBlurFilter(filter_size);
                break;*/
                
            default: 
                System.out.println("invalid filter name!");
                break;
        }
        
    }
}