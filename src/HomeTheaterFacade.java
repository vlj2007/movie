public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private Screen screen;

    public HomeTheaterFacade() {
        projector = new Projector();
        soundSystem = new SoundSystem();
        screen = new Screen();
    }

    public void watchMovie(String movie) {
        System.out.println("Подготовка к просмотру фильма: " + movie);
        screen.down();
        projector.on();
        projector.setInput("HDMI");
        soundSystem.on();
        soundSystem.setVolume(5);
        System.out.println("Фильм " + movie + " теперь идет.");
    }

    public void endMovie() {
        System.out.println("Завершение просмотра фильма.");
        screen.up();
        projector.off();
        soundSystem.off();
    }

}
